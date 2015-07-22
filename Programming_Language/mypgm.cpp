#include <iostream>
#include <string>
#include <fstream>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
int numAvail=0;
int idMax=0;
using namespace std;
class restraunt 
{
	public:
		int id;
		int numItem;
		float price[5];
		char item[5][50];
		int visited[5];
		restraunt()
		{
			numItem=0;
			for(int i=0;i<5;i++)
				visited[i]=0;
		}
		void display()
		{
			cout<<"\n\nRestraunt Id:	"<<id;
			cout<<"\n\tPrice\tItem Label";
			for(int i=0;i<numItem;i++)
				cout<<"\n\t"<<price[i]<<"\t"<<item[i];
		}
}rest[10];
class available
{
	public:
		int id;
		float cost;
		void display()
		{	
			cout<<"\nID :"<<id<<" Cost :"<<cost;
		}
}avail[10];
void readFile(char* fileName) 
{
	/*Read the file & store the restraunt data in their corresponding class objects*/
	int temp,id,fileFlag=0;
	float price;
	char ch,item[50];	
	fstream in;
	in.open(fileName,ios::in);
	if(in.fail())
	{
		cout<<"Could not open the file / File doesn't exist\n";	
		exit(0);
	}
	while(!in.eof())
	{
		if(fileFlag!=0)
			in.seekg(-1,ios::cur);
		fileFlag=1;
		in>>id;
		in>>ch;
		in>>price;
		in>>ch;
		in.getline(item,50);
		in>>ch;
		for(int i=0;item[i]!='\0';i++)
		{
			item[i]=item[i+1];
		}
		
	
		if(id>idMax)
			idMax=id;

		temp=id-1;		
		rest[temp].id=id;
		if(rest[temp].numItem==0)
		{
			rest[temp].price[0]=price;
			strcpy(rest[temp].item[0],item);
			rest[temp].numItem++;
		}
		else
		{
			rest[temp].price[rest[temp].numItem]=price;
			strcpy(rest[temp].item[rest[temp].numItem],item);
			rest[temp].numItem++;
		}
		

	}
	in.close();
}

int main(int argc,char* argv[])
{
	int minID;
	float minCost;
	float sum=0;
	readFile(argv[1]);
	
	for(int i=0;i<idMax;i++)
	{
		int flag=0;
		sum=0;
		for(int k=2;k<argc;k++)
		{			
			for(int j=0;j<rest[i].numItem;j++)
			{
				char str[50];				
				strcpy(str,rest[i].item[j]);
				char *pch;
				pch=strtok(str," ,.-");
	  			while(pch!=NULL)
	  			{
	    				if(strcmp(pch,argv[k])==0)
					{
						if(rest[i].visited[j]==0)
						{	
							sum=sum+rest[i].price[j];
						}
						flag++;
						rest[i].visited[j]=1;
					}
	    				pch=strtok(NULL, " ,.-");
				}				
			}
		}
		if(flag==argc-2)
		{
			avail[numAvail].id=i+1;
			avail[numAvail].cost=sum;
			numAvail++;
		}		
	}
	
	if(numAvail>0)
	{
		cout<<"\nThe specified meal is available at "<<numAvail<<" places .";
		minCost=999;
		for(int i=0;i<numAvail;i++)
		{
			if(avail[i].cost<minCost)
			{
				minCost=avail[i].cost;
				minID=avail[i].id;
				minCost=avail[i].cost;
			}
		}
		cout<<"\nBest deal available at \nRestraunt ID : "<<minID<<"\nat price     : "<<minCost<<"\n";
	}
	else
		cout<<"\nThe specified meal is not available !!!!\n";
		
		
	return 1;
}

	

USECASE :
	1. The user logs in through a common login portal .
	2. The editor can create a page, write a blog, upload a photo and also comment on blogs and photos. 

For Collection USER 

{
	_id : ObjectId(),
	name: NAME_OF_USER,
	username: USERNAME_FOR_LOGIN,
	password: PASSWORD_FOR_LOGIN,
	address: ADDRESS_OF_USER,
	phone_no : CONTACT_NUMBER,
	role_id : ROLE_ID_OF_THE_USER,
	last_login_time: TIMESTAMP
}
	
For Collection ROLE

{
	_id : ObjectId(),
	name: NAME_OF_ROLE,
	permissions: [ARRAY_OF_PERMISSIONS_FOR_THE_ROLE]
}

For Collection PAGE

{
	_id : ObjectID(),
	title: TITLE_FOR_PAGE,
	author_id: ID_OF_AUTHOR_CREATING_THE_BLOG,
	content: CONTENT_OF_PAGE,
	slug: URL-friendly unique representation,
	created: TIMESTAMP
}

For Collection BLOG

{
	_id : ObjectID(),
	page_id: ID_OF_THE_PAGE_WHERE_BLOGS_ARE_PRESENT
	title: TITLE_FOR_PAGE,
	author_id: ID_OF_AUTHOR_CREATING_THE_BLOG,
	content: CONTENT_OF_PAGE,
	created: TIMESTAMP,
	comment:[ ARRAY_OF_COMMENTS
			{
				_id : ObjectId(),
				created: TIMESTAMP,
				author_id: ID_OF_AUTHOR_MAKING_THE_COMMENT,
				content: CONTENT_OF_COMMENT
			}...
	]
}

For Collection PHOTO

{
	_id : ObjectID()
	title: TITLE_FOR_PHOTO
	author_id: ID_OF_AUTHOR_CREATING_THE_PHOTO
	discription: DISCRIPTION_FOR_PHOTO
	created: TIMESTAMP
	comment:[ ARRAY_OF_COMMENTS
			{
				_id : ObjectId()
				created: TIMESTAMP
				author_id: ID_OF_AUTHOR_MAKING_THE_COMMENT
				content: CONTENT_OF_COMMENT
			},...
	]
}
		
	

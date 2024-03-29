JsonParser
==========

A subpart of CS246 project

Yelp_Business

{
	'type': 'business',
	'business_id': (encrypted business id),
	'name': (business name),
	'neighborhoods': [(hood names)],
	'full_address': (localized address),
	'city': (city),
	'state': (state),
	'latitude': latitude,
	'longitude': longitude,
	'stars': (star rating, rounded to half-stars),
	'review_count': review count,
	'categories': [(localized category names)]
	'open': True / False (corresponds to closed, not business hours),
}

Yelp_Review

{
	'type': 'review',
	'business_id': (encrypted business id),
	'user_id': (encrypted user id),
	'stars': (star rating, rounded to half-stars),
	'text': (review text),
	'date': (date, formatted like '2012-03-14'),
	'votes': {(vote type): (count)}
}

Yelp_User

{
	'type': 'user',
	'user_id': (encrypted user id),
	'name': (first name),
	'review_count': (review count),
	'average_stars': (floating point average, like 4.31),
	'votes': {(vote type): (count)}
}

Yelp_Checkin

{
	'type': 'checkin',
	'business_id': (encrypted business id),
	'checkin_info': {
		'0-0': (number of checkins from 00:00 to 01:00 on all Sundays),
		'1-0': (number of checkins from 01:00 to 02:00 on all Sundays),
		...
		'14-4': (number of checkins from 14:00 to 15:00 on all Thursdays),
		...
		'23-6': (number of checkins from 23:00 to 00:00 on all Saturdays)
	} # if there was no checkin for a hour-day block it will not be in the dict
}

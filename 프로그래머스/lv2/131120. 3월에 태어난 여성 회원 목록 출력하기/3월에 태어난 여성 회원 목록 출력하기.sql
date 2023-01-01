select MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH
from MEMBER_PROFILE
where DATE_OF_BIRTH like '%-03-%' and TLNO is not null and GENDER = 'W'
order by MEMBER_ID
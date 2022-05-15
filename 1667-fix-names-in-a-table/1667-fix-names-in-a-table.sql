# Write your MySQL query statement below
select user_id,concat(Upper(Substring(name,1,1)),Lower(Substring(name,2))) as name from Users Order by user_id
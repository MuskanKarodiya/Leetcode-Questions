# Write your MySQL query statement below
select s.user_id,ROUND(
        IFNULL(SUM(c.action = 'confirmed') / COUNT(c.user_id), 0),
        2
    ) AS confirmation_rate from Signups s
left JOIN Confirmations c 
on c.user_id= s.user_id
group by s.user_id;
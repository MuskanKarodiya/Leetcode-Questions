# Write your MySQL query statement below
select s.student_id ,s.student_name ,su.subject_name, count(e.subject_name) as attended_exams from Students s
CROSS JOIN Subjects su
LEFT JOIN Examinations e
    ON s.student_id = e.student_id
   AND su.subject_name = e.subject_name
group by su.subject_name, s.student_id
order by s.student_id ,su.subject_name
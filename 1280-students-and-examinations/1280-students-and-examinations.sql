# Write your MySQL query statement below
SELECT s.student_id, s.student_name, sub.subject_name, COUNT(ex.subject_name)
AS attended_exams
FROM Students as s JOIN Subjects as sub
LEFT JOIN Examinations as ex 
ON s.student_id = ex.student_id
AND sub.subject_name = ex.subject_name
GROUP BY s.student_id, sub.subject_name
ORDER BY student_id, subject_name

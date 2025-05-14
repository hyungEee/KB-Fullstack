use speed_quiz;

select * from quiz_words where category='음식';
select word,difficulty from quiz_words where difficulty>=3;
select * from quiz_words where hint is not null;
select * from quiz_words where word like '%빵%';
select nickname, age from players where age between 20 and 29;
select * from players where region='부산';
select * from quiz_logs where is_correct='X';
select * from quiz_logs where time_taken<=5;
select * from reports where reason='오타';
select * from quiz_words where created_at='2025-05-13';

select category, count(*) as word_count
from quiz_words
group by category;
select category, avg(difficulty) as avg_diff
from quiz_words
where difficulty>=3
group by category;
select region,count(*) as user_count
from players
group by region
having count(*)>=2;
select avg(time_taken) as avg_time
from quiz_logs
where is_correct='O';
select reason,count(*) as report_count
from reports
group by reason;
select reported_at, count(*) as cnt
from reports
group by reported_at
having count(*)>=2;
select category, max(difficulty) as max_diff
from quiz_words
group by category;
select floor(age/10)*10 as age_group, avg(age)
from players
group by floor(age/10)*10;
select answered_at, count(case when is_correct='O' then 1 END)/count(*) as accuracy
from quiz_logs
group by answered_at;
select category, count(*) as count
from quiz_words
group by category
with rollup;

select word,difficulty
from quiz_words
where difficulty=(select max(difficulty) from quiz_words);
select * from quiz_words
order by created_at desc
limit 5;
select * from players
where joined_at=(select min(joined_at) from players);
select * from quiz_words
where difficulty>=(select avg(difficulty) from quiz_words);
select * from game_sessions
where total_score>=90;
select * from reports
where reported_at>=(SELECT DATE_SUB('2025-05-14', INTERVAL 3 DAY))
order by reported_at desc;
select player_id, total_score from game_sessions
where total_score=(select max(total_score) from game_sessions);
select * from players
order by age desc
limit 3;
select word, count(*) as cnt
from reports 
group by word
order by cnt desc
limit 1;
select distinct player_nickname from quiz_logs
where is_correct='O';


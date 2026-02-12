-- 코드를 입력하세요
SELECT history_id, 
        car_id, 
        DATE_FORMAT(start_date, '%Y-%m-%d'), 
        DATE_FORMAT(end_date, '%Y-%m-%d'),
        case 
            when datediff(end_date, start_date) + 1 >= 30 then '장기 대여'
            else '단기 대여'
        END AS rent_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date >= '2022-09-01' and start_date < '2022-10-01'
order by history_id desc
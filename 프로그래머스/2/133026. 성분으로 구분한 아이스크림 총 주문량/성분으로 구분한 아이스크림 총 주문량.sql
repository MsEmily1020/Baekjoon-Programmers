-- 코드를 입력하세요
SELECT i.ingredient_type, sum(f.total_order) total_order from first_half f inner join icecream_info i on i.flavor = f.flavor group by ingredient_type
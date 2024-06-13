# Write your MySQL query statement below
#prod_name , year and price -- sales_id
Select product_name , year , price 
from Sales
Left Join Product On Sales.product_id = Product.product_id;
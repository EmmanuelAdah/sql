/* question 2.31  */
SELECT DISTINCT SKU, SKU_Description 
FROM inventory
WHERE SKU_Description 
LIKE "%Half-Dome%"
/* question 2.32  */
SELECT DISTINCT SKU, SKU_Description 
FROM inventory
WHERE SKU_Description 
LIKE "%Climb%"
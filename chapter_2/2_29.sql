/* question 2.29  */
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM inventory
WHERE QuantityOnHand > 1 
AND QuantityOnOrder < 10
ORDER BY SKU ASC, SKU_Description, WarehouseID DESC
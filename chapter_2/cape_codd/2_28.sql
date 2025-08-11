/* question 2.28  */
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM inventory
WHERE QuantityOnHand = 0 or QuantityOnOrder = 0
ORDER BY SKU ASC, SKU_Description, WarehouseID DESC
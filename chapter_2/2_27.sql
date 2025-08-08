/* question 2.27  */
SELECT SKU, SKU_Description, WarehouseID
FROM inventory
WHERE QuantityOnHand > 0 and  QuantityOnHand = 0
ORDER BY SKU ASC, SKU_Description, WarehouseID DESC
/* question 2.30  */
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM inventory
WHERE QuantityOnHand
BETWEEN 2 AND 9
ORDER BY SKU ASC, SKU_Description, WarehouseID DESC
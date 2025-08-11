SELECT WarehouseID,
SUM(QuantityOnHand) AS TotalItemsOnHand
FROM cape_codd.inventory
GROUP BY WarehouseID
ORDER BY WarehouseID DESC
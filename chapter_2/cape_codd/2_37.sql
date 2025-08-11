SELECT WarehouseID,
SUM(QuantityOnHand) AS TotalItemsOnHandLT3
FROM cape_codd.inventory
WHERE TotalItemsOnHandLT3 <= 3
GROUP BY WarehouseID
ORDER BY TotalItemsOnHandLT3 DESC
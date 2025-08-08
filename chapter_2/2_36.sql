SELECT WarehouseID,
SUM(QuantityOnHand)
FROM cape_codd.inventory
GROUP BY WarehouseID

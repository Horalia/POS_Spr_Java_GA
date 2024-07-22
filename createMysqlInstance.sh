docker run --name inventory-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql:latest
sleep 15
docker exec -i inventory-mysql sh -c 'exec mysql -uroot -p"$MYSQL_ROOT_PASSWORD"' < ./schemas.sql

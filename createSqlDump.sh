docker exec inventory-mysql sh -c 'exec mysqldump --all-databases --ignore-table=mysql.innodb_index_stats --ignore-table=mysql.innodb_table_stats -uroot -p"$MYSQL_ROOT_PASSWORD"' > ./schemas.sql

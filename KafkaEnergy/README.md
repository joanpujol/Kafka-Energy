```bash
docker run --name manning-postgres -e POSTGRES_PASSWORD=secret -p 5432:5432 -d postgres:12.2
```
```bash
sudo docker exec -it manning-postgres psql -U postgres
```

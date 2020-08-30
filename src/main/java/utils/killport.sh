#pkill -f localhost:4725
kill $(lsof -t -i :4725)
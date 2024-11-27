# notely
 backend notely written in java spring boot
 ### WORK IN PROGRESS

# You need:
java openjdk 21 <br>
docker <br>
docker cli <br>
docker-compose <br>
postgresql <br>

# To run on localhost:
createdb --username=postgres notely-spring <br>
have a postgres user called debug with password debug <br>
docker compose -f docker-compose.yaml build <br>
docker compose -f docker-compose.yaml up


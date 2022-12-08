"""
Alexander Shegstad
Movies: Updates and Deletes
11/29/2022

(check) Create a new file under the module_8 directory and name it movies_update_and_delete.py.

(check) Using the example code I provided, connect to the movies database.

(check)Using the example code I have provided, call the ref function to display the selected fields and the associated Label.

show_films(cursor, "DISPLAYING FILMS")

(check) Insert a new record into the film table using a film of your choice. (Easier if you use a studio already in use..)

(check) Using the example code I have provided, call the ref function to display the selected fields and the associated Label.

(check) Using the example code I have provided, update the film Alien to being a Horror film.

(check) Using the example code I have provided, call the ref function to display the selected fields and the associated Label.

(check) Using the example code I have provided, delete the movie Gladiator.

(check) Using the example code I have provided, call the ref function to display the selected fields and the associated Label.

Hint: If you run this script more than once, you'll have mulitple additions.. and you won't be able to access the film
you deleted earlier.. in order to get a pristine output, you'll need to run that db_init_2022.sql file again (it drops the tables),
then run your update and delete script.

Take a screenshot of the results.. or copy the output into a Word document.

Make sure your output matches the expected output (this is gradable.)
"""

import mysql.connector
from mysql.connector import errorcode

config = {
    "user": "root",
    "password": "Iheartme07!",
    "host": "127.0.0.1",
    "port": "3006",
    "database": "movies",
    "raise_on_warnings": True
}
db = mysql.connector.connect(**config)

try:
    db = mysql.connector.connect(**config)

    print("\n Database user {} connected to MYSQL on host {} with database {}"
          .format(config["user"], config["host"], config["database"]))

    input("\n\n Press any key to continue...")

except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print(" The supplied username or password are invalid")

    elif err.errno == errorcode.ER_BAD_DB_ERROR:
        print(" The specified database does not exist")

    else:
        print(err)

finally:
    db.close()

db = mysql.connector.connect(**config)
cursor = db.cursor()

# method to execute an inner join on all tables,
# iterate over the dataset and output the results to the terminal window


def show_films(cursor, title):

    # Inner join query (Think of x=y as the center of the venn diagram between x and y)
    cursor.execute("SELECT film_name as Name, film_director as Director, genre_name as Genre, studio_name as "
                   "'Studio Name' from film INNER JOIN genre ON film.genre_id=genre.genre_id INNER JOIN studio ON "
                   "film.studio_id=studio.studio_id")

    # get the results from the cursor object
    films = cursor.fetchall()

    print("\n == {} ==".format(title))

    # iterate over the film data set and display the results
    for film in films:
        print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n"
              .format(film[0], film[1], film[2], film[3]))


# The first use of the show_films() method
show_films(cursor, "Displaying Films")

# Inserting the new film into the database
cursor.execute("INSERT INTO film (film_name, genre_id, film_director, film_releaseDate, film_runtime, studio_id) "
               "Values('Happy Death Day', 1, 'Christopher Landon', '2017', 96, 2)"
               )
# The second use of the show films method
show_films(cursor, "Displaying Films")

# Change the genre of Alien (film_ID # 2) from SciFi (genre_id 2) to Horror (genre_ID 1)
cursor.execute("UPDATE film SET film_id = 2, genre_id = 1 where genre_id = 2")

# The third use of the show films method
show_films(cursor, "Displaying Films")

# Deleting the movie Gladiator
cursor.execute("DELETE FROM film WHERE film_ID = 1")

# The fourth use of the show films method
show_films(cursor, "Displaying Films")


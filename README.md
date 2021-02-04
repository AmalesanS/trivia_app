Trivia Data

* `trivia.json` - the original data format
* `data.sql` - INSERT statements for the same data from the JSON file. You can put this file directly into your Spring `resources` folder.
* `com.trivia.util.JsonDataLoader.java` - A Spring component that will parse the JSON file then save the data to the database. This file assumes you have the JSON file in your `resources` folder.
* `com.trivia.util.DataLoader.java` - **WARNING!** This is a big file! Your IDE may freeze when opening it. This is just a file full of `save` calls for all the data available in the JSON file. This is usable but may be too much for some machines.
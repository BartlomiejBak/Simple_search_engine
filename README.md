https://hyperskill.org/projects/66/stages/359/implement

# Simple_search_engine
Description
Now,  improve your search engine to support complex queries containing a sequence of words and a strategy that determines how to match data.

There are six sample lines:

Dwight Joseph djo@gmail.com
Rene Webb webb@gmail.com
Katie Jacobs
Erick Harrington harrington@gmail.com
Myrtle Medina
Erick Burgess
Let's consider the searching strategies: ALL, ANY and NONE.

If the strategy is ALL, the program should print lines containing all words from the query.
Query:

Harrington Erick
Result:

Erick Harrington harrington@gmail.com
 

If the strategy is ANY, the program should print lines containing at least one word from the query.
Query:

Erick Dwight webb@gmail.com
Result:

Erick Harrington harrington@gmail.com
Erick Burgess
Dwight Joseph djo@gmail.com
Rene Webb webb@gmail.com
 

If the strategy is NONE, the program should print lines that do not contain words from the query at all:
Query:

djo@gmail.com ERICK
Result:

Katie Jacobs
Myrtle Medina
Rene Webb webb@gmail.com

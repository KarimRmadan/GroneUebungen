import sqlite3
import os.path
def tiertabelle_anlegen():
    try:
        is_db_open = False
        if os.path.exists ("tiereimzoo.db"):
            connection = sqlite3.connect ("tiereimzoo.db")
            is_db_open = True
            cursor = connection.cursor()
            sql_anweisung = "CREATE TABLE Tier ( " \
                            "TierID INTEGER PRIMARY KEY AUTO_INCREMENT," \
                            "Name TEXT," \
                            "Groesse REAL," \
                            "Gewicht REAL," \
                            "Geburtsdatum DATE," \
                            "OrtID INTEGER" \
                            ")"
            cursor.execute(sql_anweisung)

    except Exception as e:
        print(f"Es ist folgender Fehler aufgetreten: {e}")
    finally:
        if is_db_open == True:
            connection.close()
package Maps;
/*
Stwórz klasę User, obiekty typu User mają posiadać pola email, password, points oraz role (enum którego wartości mogą przyjmować np pozycje ADMIN, CLIENT itp).

Zaimplementuj i przetestuj klasę UserRepository z mapą, w której kluczami będą maile użytkowników a wartościami obiekty użytkowników.

Stwórz metody:
 add - przyjmującą obiekt typu User
add - przyjmująca dwie wartości String i tworząca User dodając go do mapy.
countUsers - zwracająca liczbę użytkowników w repozytorium
containsMail - zwracająca true jeśli na liście znajduje się dany mail
get - przyjmująca mail i zwracająca obiekt typu User
login - przyjmującą email i password użytkownika i zwracająca zalogowanego użytkownika lub rzucająca wyjątek z odpowiednią wiadomością jeśli podano błędny email lub password
remove - pozwalająca usunąć użytkownika po mailu
containsAdmin - zwracająca true jeśli na liście znajduje się przynajmniej jeden obiekt o roli ADMIN

 */

public enum Rols {

    Admin,
    Client;


}

//Дана строка sql-запроса:
//select * from students where "
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
//Если значение null, то параметр не должен попадать в запрос.
//Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
//String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
//Пример: Строка sql-запроса:
//select * from students where
//Параметры для фильтрации:
//        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Результат:
//select * from students where name='Ivanov' and country='Russia' and city='Moscow'

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        String modifiedPARAMS = PARAMS.replace("{", "").replace("}", "")
                .replace("\"", "").replace(" ", "");
        String name = modifiedPARAMS.split(",")[0].split(":")[1];
        String country = modifiedPARAMS.split(",")[1].split(":")[1];
        String city = modifiedPARAMS.split(",")[2].split(":")[1];
        String age = modifiedPARAMS.split(",")[3].split(":")[1];

        StringBuilder result = new StringBuilder(QUERY);

        if (!name.equals("null")) {
            result.append("name=").append("'").append(name).append("'");
        }

        if (!name.equals("null") && (!country.equals("null") || !city.equals("null") || !age.equals("null"))) {
            result.append(" and ");
        }

        if (!country.equals("null")) {
            result.append("country=").append("'").append(country).append("'");
        }

        if (!country.equals("null") && (!city.equals("null") || !age.equals("null"))) {
            result.append(" and ");
        }

        if (!city.equals("null")) {
            result.append("city=").append("'").append(city).append("'");
        }

        if (!city.equals("null") && !age.equals("null")) {
            result.append(" and ");
        }

        if (!age.equals("null")) {
            result.append("age=").append("'").append(age).append("'");
        }
        return result;
    }
}

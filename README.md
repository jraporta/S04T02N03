## 📄Assignment

Create a CRUD with a MongoDB database.

## 💻Technologies

- Spring Boot
- MongoDB
- Gradle
- Postman

## 📋Requirements

- JDK 21
- Gradle 8.10.2
- MongoDB

## 🛠️Installation

- Install MongoDB.
- Launch MongoDB as a service by launching it in a console window by running the command: `mongod`

## ▶️Execution

### Run the project
- Open a command prompt window.
- Navigate to the project’s root directory.
- Execute the following command to start the application: `gradlew.bat bootRun`

## 🌐Deployment

Not deployed.

## 🤝Contributions

No contributions.

## 🚩Endpoints Table

| Endpoint                                  | Method | Params/Body                   | Response Codes                               | Description               |
|-------------------------------------------|--------|-------------------------------|----------------------------------------------|---------------------------|
| `http://localhost:8080/fruit/add`         | POST   | `{ name, quantityKilograms }` | 200, 400 ("Fruit already exists")            | Adds new fruit.           |
| `http://localhost:8080/fruit/update`      | PUT    | `{ name, quantityKilograms }` | 200, 404 ("No fruit found with name {name}") | Updates an exiting fruit. |
| `http://localhost:8080/fruit/delete/{id}` | DELETE | `{ id }`                      | 200, 404 ("No fruit found with id {id}")     | Deletes a fruit.          |
| `http://localhost:8080/fruit/getOne/{id}` | GET    | `{ id }`                      | 200, 404 ("No fruit found with id {id}")     | Get fruit.                |
| `http://localhost:8080/fruit/getAll`      | GET    | N/A                           | 200                                          | Get all the fruits.       |



## JSON Format

- **Add Fruit.** Request body:
    ```json
        {
            "name":"Apple",
            "quantityKilograms":2.8
        }
    ```
  Response: `Added fruit with id {id}`


- **Update Fruit.** Request body:
    ```json
        {
            "name":"Apple",
            "quantityKilograms":1.5
        }
    ```
  Response: `Updated fruit with id {id}`


- **Delete Fruit.** Response: `Deleted fruit with id {id}`


- **Get Fruit.** Response:
    ```json
    {
        "id": "6729f337735984330cf74d60",
        "name": "plum",
        "quantityKilograms": 8.0
    }
    ```

- **Get all Fruits.** Response:
    ```json
    [
      {
        "id": "6729efa3d6d6161eb7b21736",
        "name": "apple",
        "quantityKilograms": 10.0
      },
      {
        "id": "6729efafd6d6161eb7b21737",
        "name": "watermelon",
        "quantityKilograms": 8.0
      },
      {
        "id": "6729f337735984330cf74d60",
        "name": "plum",
        "quantityKilograms": 8.0
      }
    ]
    ```
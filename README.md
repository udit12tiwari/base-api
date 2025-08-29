# Display Name API

Small Spring Boot REST API that exposes GET /api/display-name and returns a JSON with a displayName field.

How to run (Windows PowerShell):

```powershell
# from repository root
mvn -q clean package
java -jar target/display-name-api-0.0.1-SNAPSHOT.jar
```

You can override the display name with a system property or environment variable:

```powershell
# system property
java -Ddisplay.name="Alice" -jar target/display-name-api-0.0.1-SNAPSHOT.jar

# environment variable (PowerShell)
$env:DISPLAY_NAME = "Alice"; java -jar target/display-name-api-0.0.1-SNAPSHOT.jar
```

Endpoint:

- GET /api/display-name -> { "displayName": "..." }
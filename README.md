# Inventory Manager App

A JavaFX-based desktop application for managing inventory with a modern user interface.

## 🚀 Features

- Modern JavaFX user interface
- Inventory tracking and management
- Cross-platform compatibility
- Java 21 LTS support

## 📋 Prerequisites

Before running this application, make sure you have:

- **Java 21 LTS** or later installed
- **Apache Maven 3.6+** for building the project
- **JavaFX 21** (included as dependency)

## 🛠️ Installation & Setup

### 1. Clone the Repository
```bash
git clone <your-repository-url>
cd inventory-manager-app
```

### 2. Verify Java Installation
```bash
java --version
```
Should show Java 21 or later.

### 3. Build the Project
```bash
mvn clean compile
```

### 4. Run the Application
```bash
mvn javafx:run
```

## 🏗️ Project Structure

```
inventory-manager-app/
├── src/
│   └── main/
│       ├── java/
│       │   ├── module-info.java
│       │   └── com/inventorytracker/
│       │       ├── App.java                 # Main application class
│       │       ├── PrimaryController.java   # Primary view controller
│       │       └── SecondaryController.java # Secondary view controller
│       └── resources/
│           └── com/inventorytracker/
│               ├── primary.fxml            # Primary UI layout
│               └── secondary.fxml          # Secondary UI layout
├── target/                                 # Build output directory
├── pom.xml                                # Maven configuration
└── README.md                              # This file
```

## 🔧 Technologies Used

- **Java 21 LTS** - Programming language
- **JavaFX 21.0.5** - UI framework
- **Maven 3.11.0** - Build tool and dependency management
- **FXML** - UI layout definitions

## 💻 Development

### Building from Source
```bash
# Clean previous builds
mvn clean

# Compile the project
mvn compile

# Package the application
mvn package

# Run the application
mvn javafx:run
```

### IDE Setup
This project can be imported into any Java IDE that supports Maven:
- **IntelliJ IDEA** (recommended)
- **Eclipse**
- **Visual Studio Code** with Java extensions

## 🐛 Troubleshooting

### Common Issues

**Issue**: `Module not found` errors
```bash
# Solution: Ensure Java 21 is being used
java --version
mvn -version
```

**Issue**: JavaFX runtime components missing
```bash
# Solution: The JavaFX dependencies are included in pom.xml
# Run with Maven to ensure proper module path setup
mvn javafx:run
```

## 📦 Packaging for Distribution

To create a JAR file:
```bash
mvn clean package
```

The generated JAR will be in the `target/` directory.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the [MIT License](LICENSE) - see the LICENSE file for details.

## 👥 Authors

- **Your Name** - *Initial work* - [YourGitHubUsername](https://github.com/yourusername)

## 🙏 Acknowledgments

- JavaFX community for excellent documentation
- Maven for build automation
- OpenJDK team for Java 21 LTS

---

**Note**: This application requires Java 21 LTS. Make sure your `JAVA_HOME` environment variable points to a Java 21 installation.
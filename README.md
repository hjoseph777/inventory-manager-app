# Lab6 Inventory Manager GUI

## Project Metadata
- Author: Harry Joseph
- Created: 2025-10-16
- Platform: JavaFX (Java 21 LTS + Maven)
- Package Manager: Maven
- Java Version: 21 LTS
- UI Framework: JavaFX 21

## Overview
Lab6 Inventory Manager GUI demonstrates a modern JavaFX desktop application for inventory management. The project showcases event-driven programming with explicit EventHandler classes and programmatic UI creation without FXML.

## Quick Download

**Get the complete project instantly:**

[![Download Lab6 Inventory Manager](https://img.shields.io/badge/Download-inventory--manager--app.zip-blue?style=for-the-badge&logo=github)](https://github.com/hjoseph777/inventory-manager-app/releases/download/v1/inventory-manager-app.zip)

*Complete JavaFX project ready to run*

## Important: Where your key code lives
- The main application is in [`src/main/java/com/inventorytracker/InventoryManager.java`](src/main/java/com/inventorytracker/InventoryManager.java) with event handlers and UI creation
- The Maven configuration is in [`pom.xml`](pom.xml) with JavaFX dependencies

## Project Explorer
An interactive, collapsible view of the codebase. Click file names to open them.

<details open>
   <summary><strong>src/main/java/ – Core Application</strong></summary>

   - 📁 <strong>src/main/java</strong>
      - 📄 [`module-info.java`](src/main/java/module-info.java) – Java module configuration
      - 📁 <strong>com/inventorytracker</strong>
         - 🏠 [`InventoryManager.java`](src/main/java/com/inventorytracker/InventoryManager.java) – **Main application with event handlers**
</details>

<details open>
   <summary><strong>src/main/resources/ – UI Resources</strong></summary>

   - 📁 <strong>src/main/resources</strong>
      - 📁 <strong>com/inventorytracker</strong>
         - 🎨 [`primary.fxml`](src/main/resources/com/inventorytracker/primary.fxml) – Primary UI layout (reference)
         - 🎨 [`secondary.fxml`](src/main/resources/com/inventorytracker/secondary.fxml) – Secondary UI layout (reference)
</details>

<details open>
   <summary><strong>Root Configuration</strong></summary>

   - ⚙️ [`pom.xml`](pom.xml) – **Maven configuration with JavaFX dependencies**
   - 📝 [`README.md`](README.md) – Documentation (this file)
</details>

<details open>
## File structure

```text
inventory-manager-app/
├── 📁 src/main/java/
│   ├── 📄 module-info.java
│   └── 📁 com/inventorytracker/
│       └── 🏠 InventoryManager.java
│
├── 📁 src/main/resources/
│   └── 📁 com/inventorytracker/
│       ├── 🎨 primary.fxml
│       └── 🎨 secondary.fxml
│
├── ⚙️ pom.xml
└── 📝 README.md
```

## Quick Code Reference
| Icon | Type | Path | Purpose |
|------|------|------|---------|
| 📄 | Config | [`module-info.java`](src/main/java/module-info.java) | Java module with JavaFX dependencies |
| 🏠 | Main | [`InventoryManager.java`](src/main/java/com/inventorytracker/InventoryManager.java) | **Main application with event handlers** |
| ⚙️ | Config | [`pom.xml`](pom.xml) | **Maven configuration with JavaFX** |
| 🎨 | UI | [`primary.fxml`](src/main/resources/com/inventorytracker/primary.fxml) | Primary UI layout (reference) |
| 🎨 | UI | [`secondary.fxml`](src/main/resources/com/inventorytracker/secondary.fxml) | Secondary UI layout (reference) |

## Demo Screenshots

```
Live screenshots from the automated testing:
```

### Initial State
![Initial Empty Form](test_screenshots/01_Initial_state.png)

### Form Filled
![Form Filled](test_screenshots/02_form_filled.png)

### Save Button Hover
![Save Button Hover](test_screenshots/03_save_button_hover.png)

### Mouse Event Handler A
![Mouse Event Handler A](test_screenshots/04_Amouse_event_handler.png)

### Mouse Event Handler B
![Mouse Event Handler B](test_screenshots/04_Bmouse_event_handler.png)

### Save Button Message
![Save Button Message](test_screenshots/05_Asave_button_Message.png)

### Price Entered Message
![Price Entered Message](test_screenshots/06_price_entered_message.png)

*Automated test screenshots showing different GUI states*

## Video code Demo

You can view or download the video externally on ScreenPal:

- Watch the video on ScreenPal: https://go.screenpal.com/watch/cT6Fhynb48Y
- Or open in your browser: [Watch the video on ScreenPal](https://go.screenpal.com/watch/cT6Fhynb48Y)

## 🚀 Features

- Modern JavaFX user interface with programmatic layout
- Event-driven programming with explicit EventHandler classes
- Cross-platform compatibility (Windows, macOS, Linux)
- Java 21 LTS support


## 👥 Authors

- **Harry Joseph** - *Initial work* - [hjoseph777](https://github.com/hjoseph777)

## 🙏 Acknowledgments

- JavaFX community for excellent documentation
- Maven for build automation
- OpenJDK team for Java 21 LTS
---


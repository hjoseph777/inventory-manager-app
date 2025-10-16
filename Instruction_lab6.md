# instruction_lab6.md

## Objective  
Create a JavaFX-based **Inventory Recording Application** that demonstrates core **event-driven programming** concepts while adhering to professional software development standards. The application must feature a clean, responsive graphical user interface (GUI) with interactive components responding to **button clicks**, **keyboard input**, and **mouse movements**—all implemented **without lambda expressions**, using explicit `EventHandler` classes or inline anonymous classes.

In addition to functional correctness, the implementation must emphasize **readable, maintainable, and human-like code**, accompanied by a **distinctive and creative user interface** that stands out from generic templates.

---

## Application Requirements  

### 1. **Basic GUI Layout**  
Construct a window containing the following UI elements:  
- **Text Field**: For entering the **Product Number**  
- **Text Field**: For entering the **Product Description (Name)**  
- **Text Field**: For entering the **Product Price**  
- **Button**: Labeled **“Save”**  
- **Button**: Labeled **“Quit”**  

Arrange these components using a layout pane (e.g., `GridPane` or `VBox`) for clarity and usability.  
> 💡 **Design Note**: Enhance visual appeal with thoughtful spacing, alignment, and optional styling (e.g., custom fonts or padding) to create a **unique, non-template look**.

---

### 2. **Button Click Event Handling**  

#### a. **“Save” Button**  
- Attach an `EventHandler<ActionEvent>` to the **Save** button.  
- When clicked:  
  - Retrieve the current values from all three text fields.  
  - Validate that none are empty (optional but recommended).  
  - Display an **Alert dialog** (type: `Alert.AlertType.INFORMATION`) with a success message such as:  
    > “Product saved! Number: [value], Name: [value], Price: [value]”  

#### b. **“Quit” Button**  
- Attach an `EventHandler<ActionEvent>` to the **Quit** button.  
- When clicked:  
  - Close the application window using `stage.close()`.  

> 💡 **Implementation Note**: Use **anonymous inner classes** for event handlers (e.g., `new EventHandler<ActionEvent>() { ... }`), **not lambda expressions**.

---

### 3. **Keyboard Event Handling**  

- Attach an `EventHandler<KeyEvent>` to the **Price** text field.  
- Listen for the **Enter key** (`KeyCode.ENTER`).  
- When detected:  
  - Trigger a confirmation message. You may choose **one** of the following:  
    - Print `"Price entered!"` to the console via `System.out.println()`, **or**  
    - Show a small `Alert` dialog with the same message.  

> ⚠️ Ensure the handler only responds to the **Enter key**, not other keys.

---

### 4. **Mouse Event Handling**  

For **both** the **Save** and **Quit** buttons:  

#### a. **Mouse Entered**  
- Attach an `EventHandler<MouseEvent>` for `MOUSE_ENTERED`.  
- When the mouse hovers over the button:  
  - Change its background color to **light blue** using `setStyle("-fx-background-color: lightblue;")`.

#### b. **Mouse Exited**  
- Attach an `EventHandler<MouseEvent>` for `MOUSE_EXITED`.  
- When the mouse leaves the button:  
  - Restore the original button style (e.g., `setStyle("")` or reset to default).  

> 🎨 **Design Tip**: Ensure visual feedback is immediate and reversible for a polished user experience.

---

## Code Quality & Style Requirements  

### 1. **Readable and Maintainable Code**  
- Use **descriptive names** for all variables, methods, and UI components (e.g., `productNumberField`, `handleSaveButtonClick`).  
- Break logic into **small, focused functions**—even within the JavaFX `start()` method—to isolate responsibilities (e.g., `setupUI()`, `configureEventHandlers()`).  

### 2. **Human-Like Code and Comments**  
- Write comments that explain **why** something is done, not just **what** is done.  
- Avoid robotic or repetitive phrasing (e.g., “This method handles the save button”). Instead, use natural language:  
  > “When the user clicks ‘Save’, we grab the current form values and pop up a friendly confirmation.”  
- Comments should feel like they were written by a thoughtful developer—not an AI or a textbook.

### 3. **Distinctive Output or Menu Design**  
- Go beyond basic JavaFX defaults. Consider:  
  - Custom window title (e.g., “✨ Harry’s Inventory Tracker”)  
  - Subtle styling (e.g., rounded corners, consistent padding, readable fonts)  
  - A unique alert message tone (e.g., warm, slightly playful, but still professional)  
- The overall look should feel **intentional and creative**, not like a boilerplate lab submission.

---

## Technical Constraints  

- **Language**: Java (compatible with JavaFX 17+)  
- **Framework**: JavaFX  
- **Event Handling**: Must use **explicit `EventHandler` implementations**—**no lambda expressions** allowed.  
- **File Structure**:  
  - Main class: `InventoryManager.java`  
  - Output: Runnable JavaFX application  
- **Styling**: Inline CSS via `setStyle()` is acceptable for hover effects and minor enhancements.  

---

## Deliverables  

1. A fully functional JavaFX application meeting all functional and stylistic requirements.  
2. Clean, modular, and well-commented code that reflects professional craftsmanship.  
3. This `instruction.md` file, saved in the project root, serving as the **single source of truth** for requirements and design expectations.  

> ✅ **Critical Reminder**: Always refer to this `instruction_lab6.md` file during development and review to ensure precise alignment with the rubric, avoid memory gaps, and maintain consistency in both functionality and presentation.
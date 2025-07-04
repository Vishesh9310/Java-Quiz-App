## Java Quiz-App

A console-based interactive **Java Quiz Application** that challenges users with timed questions, difficulty levels, scoring, and real-time feedback — all from your terminal!

---

## 🚀 Features

- 📋 Multiple Choice Questions (MCQs)
- ⏱ 10-second timer per question
- 🎚 Difficulty levels: Easy, Medium, Hard
- 🎯 Score based on difficulty:
  - Easy: +5 points  
  - Medium: +10 points  
  - Hard: +15 points
- 🔀 Randomized question order
- 👤 Personalized user session (enter your name)
- 📊 Final result summary (Correct, Incorrect, Skipped, Score)

---

## 🛠 Technologies Used

- Object-Oriented Programming (OOP)
- Collections (`ArrayList`)
- Java Enum (`Difficulty`)
- Console I/O with `Scanner`
- System Time functions (`System.currentTimeMillis()`)

---

## 🧱 Project Structure

```

QuizApp/
│
├── Difficulty.java       # Enum for question difficulty
├── Question.java         # Question model class
├── Quiz.java             # Main quiz logic (timer, score, randomization)
└── Main.java             # Entry point for the application

````

---

## 📦 How to Run

### 🔧 Prerequisites
- JDK 14 or higher
- Command line terminal (CMD, PowerShell, Bash)

### 💻 Compile the files:

```bash
javac *.java
````

### ▶ Run the app:

```bash
java Main
```

---

## 📸 Example Output

```
Welcome to the Advanced Quiz App!
Enter your name: Vishesh

Quiz Starting for Vishesh...

Capital of Japan? [EASY]
1. Tokyo
2. Beijing
3. Seoul
4. Bangkok
You have 10 seconds to answer (or type 0 to skip): 1
Correct!

Time complexity of binary search? [HARD]
1. O(n)
2. O(log n)
3. O(n log n)
4. O(1)
You have 10 seconds to answer (or type 0 to skip): 1
Incorrect! Correct Answer: Option 2

...

Quiz Summary for Vishesh
Correct Answers: 3
Incorrect Answers: 1
Skipped Questions: 1
Total Score: 30
```

---

## 📚 Learning Outcomes

* Java class design (encapsulation, enums)
* Control flow & logic
* Timers & input handling
* Object and collection manipulation
* Writing clean and modular code

---

## 🧑‍💻 Author

**Vishesh**

---

## 📜 License

This project is open-source and free to use for learning and personal projects.

---

Happy Coding! 🧠💻

```
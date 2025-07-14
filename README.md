# Compose-Retrofit-MVVM-Demo

This is a simple Android project that demonstrates how to fetch data from a remote API and display it in a Jetpack Compose UI. It’s designed to help understand how networking works in frontend Android development using modern tools and practices.

---

## Why This Project

In modern Android apps, connecting to APIs and displaying data is essential. This project was created to show how to integrate a real API into a Compose UI and handle data loading, using **Retrofit**, one of the most widely-used networking libraries in Android development.

---

## What is Retrofit

**Retrofit** is a popular HTTP client library for Android. It makes it easy to perform network requests and convert server responses into Kotlin data classes automatically. Instead of writing boilerplate code for networking, Retrofit lets you define API endpoints as simple interfaces and handles the rest for you.

In this project, Retrofit is used to:

- Define an API interface for fetching users.
- Make an HTTP GET request to a public API.
- Parse JSON responses into Kotlin data classes.

---

## How It Works

- The app uses Retrofit to call the JSONPlaceholder API and fetch a list of users.
- A ViewModel handles the network call asynchronously using Kotlin Coroutines.
- Jetpack Compose displays the data in a clean UI.
- A button triggers the data load.

---

## How To Run

1. Clone this repository:
    ```
    git clone https://github.com/engineer-aman-sharma/Compose_Retrofit_MVVM_Demo
    ```
2. Open the project in Android Studio.
3. Run the app on a device or emulator.
4. Tap the **Load Users** button to fetch and display data.

---

## Libraries Used

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Retrofit](https://square.github.io/retrofit/)
- [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines)
- [JSONPlaceholder API](https://jsonplaceholder.typicode.com/)

---

## Possible Improvements

- Add loading indicators and error handling.
- Display user details on a separate screen.
- Load user avatars using an image library like Coil.
- Write UI tests for Compose components.

---

## Author

Aman Sharma  
Android Developer | Jetpack Compose | Kotlin | MVVM  

### 🙌 Contact

📧 [Email](mailto:officialprofin@gmail.com)  
🔗 [LinkedIn Profile](https://in.linkedin.com/in/engineer-aman-sharma)

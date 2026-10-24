# BookPaste

A Minecraft mod by **SvyatON**.

Paste large texts directly into writable books and signs with automatic formatting and page splitting!

## 📥 Downloads

- **[Modrinth](https://modrinth.com/mod/bookpaste)**
- **[CurseForge](https://www.curseforge.com/minecraft/mc-mods/bookpaste)**

## ✨ Features

- **Books:** Intercepts paste in the writable book screen. Splits large clipboard text across book pages automatically.
- **Signs:** Seamlessly pastes text into signs, splitting words correctly across lines.
- **Smart Formatting:** Prefers paragraph, line, sentence, or word boundaries when cutting pages or lines, preventing awkward word cuts.
- **Overflow Handling:** When a book becomes full, the mod leaves only the unfinished tail in your clipboard and shows an on-screen notification.

## 📖 Usage

1. Open a writable book or interact with a sign.
2. Copy a large text from anywhere.
3. Press `Ctrl+V` (or your configured paste shortcut).
4. Watch the mod do the magic!

## ⚙️ Compatibility

- **Minecraft:** Java Edition `26.3` (this branch).
- **Mod Loaders:** Fabric.
- Requires **Java 25**, **Fabric Loader 0.19.5 or newer**, and **Fabric API for 26.3**.
- Compatible with popular book and sign improvement mods (e.g., Scholar, Scribble).

## Build

This branch is based on `26.2` and builds the 26.3 mod directly from `src/main`.
Use a Java 25 JDK and run:

```powershell
.\gradlew.bat build
```

The mod is written to `build/libs/bookpaste-2.2+26.3.jar`.
`Ctrl+V` (or `Cmd+V` on macOS) and `Shift+Insert` paste text; `F8` cycles the formatting mode.
The formatting hotkey can be changed in Minecraft's controls settings.

## 📄 License

Apache License 2.0

# Cupcake CodeCheck Free-Coding Activities

Auto-graded programming and free-coding practice activities adapted from Cay Horstmann's **CodeCheck** in the ADAPT / Smart Learning Content (SLC) Catalog:

https://adapt2.sis.pitt.edu/next.course-authoring/#/catalog-v2

## Contents

This repository contains **516 free-coding activities** conforming to the Cupcake `free-coding/0.1.0` specification:

- **Authored by Cay Horstmann**: Developed at San José State University, providing instant, student-friendly autograding feedback on introductory to intermediate programming exercises.
- **Language Separation**: Partitioned into subdirectories by programming language:
  - `cpp/` (**166 activities**): Modern C++ (C++17) covering double loops, array manipulation, neighbor comparisons, string parsing, and algorithmic problem-solving.
  - `java/` (**184 activities**): Core Java (Java 17) based on Cay Horstmann's *Big Java* curriculum, covering object-oriented design, interfaces, recursion, streams, file I/O, sorting, and concurrency.
  - `python/` (**166 activities**): Python (Python 3) covering lists, strings, loops, numeric transformations, and functions.
- **Segmented Editor Regions**: Faithful translation of CodeCheck's multi-part editor architecture into Cupcake's `elements` specification (`type: locked` for read-only boilerplate/wrapper code and `type: editable` for starter student code with placeholder guidance).
- **Companion & Test Files**: 91 activities requiring auxiliary files (e.g. `data.txt`, test harnesses, helper classes) bundle these assets alongside the source code and reference them via `includes`.
- **Complete Metadata & Topics**: Includes academic author attribution, difficulty level (`novice`), and knowledge component topics namespaced by concept (`horstmann:<concept>`).

## Layout

```
cpp/
  └── codecheck_cpp_doubleloops_4/
      ├── prog.cpp
      └── codecheck_cpp_doubleloops_4_en.yaml

java/
  └── codecheck_bj_4_io2_104/
      ├── TextMangler.java
      ├── data.txt
      └── codecheck_bj_4_io2_104_en.yaml

python/
  └── codecheck_python_twoanswers_2/
      ├── prog.py
      └── codecheck_python_twoanswers_2_en.yaml
```

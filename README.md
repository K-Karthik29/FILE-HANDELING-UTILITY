# FILE-HANDELING-UTILITY

*company*:code tech IT solutions

*name*:K.Karthik

*intern ID*:CT04DN1942

*domain*:JAVA programming

*duration*:4 weeks

*mentor*:neela santosh

 *discription about File handling*:
                         File handling in Java involves managing data storage and retrieval operations, enabling programs to interact with files for reading, writing, and manipulation. The java.io package provides core classes for these operations, while java.nio.file offers advanced functionalities.
Key Classes and Concepts:
File:
The java.io.File class represents a file or directory path, allowing operations such as checking existence, creating directories, and navigating the file system. It's a foundational class for file handling.
Streams:
Java uses streams to handle data flow. Byte streams (e.g., FileInputStream, FileOutputStream) process data in bytes, suitable for binary files. Character streams (e.g., FileReader, FileWriter) handle character-based data, like text files, and are often preferred for text-based operations.
Reading:
Classes like FileReader, BufferedReader, and Scanner are used for reading data from files. FileReader reads character by character, BufferedReader reads line by line for efficiency, and Scanner parses data based on patterns.
Writing:
FileWriter and BufferedWriter are used for writing data to files. FileWriter writes characters, while BufferedWriter buffers writes for better performance.
Creating:
New files and directories can be created using the File class's methods like createNewFile() and mkdir().
Deleting:
Files can be deleted using the delete() method of the File class.
File Attributes:
The File class provides methods to retrieve file information, such as size, last modified time, and permissions.
Exception Handling:
File operations often require exception handling (using try-catch blocks) due to potential I/O errors, such as file not found or permission issues.
Closing Streams:
It's crucial to close streams using the close() method to release resources and ensure data is properly written to the file. try-with-resources statements can automatically close streams.
Common Operations:
Creating a file: Using File and FileWriter or BufferedWriter.
Writing to a file: Using FileWriter or BufferedWriter.
Reading from a file: Using FileReader, BufferedReader, or Scanner.
Appending to a file: Using FileWriter with the append mode set to true.
Deleting a file: Using the delete() method of the File class.

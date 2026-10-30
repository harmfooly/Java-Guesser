Project/Guesser.class: Project/Guesser.java
	javac -g Project/Guesser.java

clean:
	rm -f Project/*.class

run: Project/Guesser.class
	java Project.Guesser

debug: Project/Guesser.class
	jdb Project.Guesser
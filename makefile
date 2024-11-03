P=Main
MAIN_CLASS=aplicacion.$(P)
SRC_DIR=./src
OUT_DIR=bin
LIB_DIR=./lib
DOC_DIR=html
JAR_FILE = $(P).jar
compilar:limpiar
	mkdir $(OUT_DIR)
	find $(SRC_DIR) -name *.java | xargs javac -cp $(OUT_DIR):$(LIB_DIR) -d $(OUT_DIR)

jar:compilar
	jar cvfm $(JAR_FILE) manifest.txt  -C  $(OUT_DIR) .
ejecutar:compilar
	java -cp $(OUT_DIR) $(MAIN_CLASS) 
limpiar:
	rm -rf $(OUT_DIR)
	rm -rf $(DOC_DIR)
	rm -f $(JAR_FILE)
javadoc:compilar
	find . -type f -name "*.java" | xargs javadoc -d $(DOC(DIR) -encoding utf-8 -docencoding utf-8 -charset utf-8
debug: compilar

	find $(SRC_DIR) -name *.java | xargs javac -g -cp $(OUT_DIR):$(LIB_DIR) -d $(OUT_DIR)
	cd bin; jdb -sourcepath ../src
runjar: jar
	@echo "Manifest-Version: 1.0" > manifest.txt
	@echo "Main-Class:" $(MAIN_CLASS) >> manifest.txt
	@echo "Class-Path: . ">> manifest.txt
	@echo "" >> manifest.txt	
	java -jar $(JAR_FILE) 

# Nombre del archivo JAR y de la carpeta de clases compiladas
JAR_NAME = proyecto.jar
BUILD_DIR = build
SRC_DIR = src
DOC_DIR = doc

# Buscar todos los archivos .java en el directorio fuente
SOURCES = $(wildcard $(SRC_DIR)/*.java)

all: compile jar javadoc


compile:
	mkdir -p $(BUILD_DIR)
	javac -d $(BUILD_DIR) $(SOURCES)

jar: compile
	jar cvf $(JAR_NAME) -C $(BUILD_DIR) .


javadoc:
	mkdir -p $(DOC_DIR)
	javadoc -d $(DOC_DIR) $(SOURCES)

clean:
	rm -rf $(BUILD_DIR) $(JAR_NAME) $(DOC_DIR)

run: jar
	java -jar $(JAR_NAME)
-
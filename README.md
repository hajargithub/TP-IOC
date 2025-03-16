# TP Inversion de Contrôle (IoC) et Injection de Dépendances  

## 📌 Objectif  
Ce projet illustre le concept d'**Inversion de Contrôle (IoC)** et d'**Injection de Dépendances (DI)** en Java. Il explore différentes méthodes d'injection :  
- **Instanciation statique**  
- **Instanciation dynamique**  
- **Utilisation de Spring** (XML et annotations)  

---

## 📁 Structure du projet  
```TP-IOC/
│── src/
│   ├── dao/               # Interface IDao et son implémentation
│   ├── metier/            # Interface IMetier et son implémentation
│   ├── presentation/      # Classe principale (point d'entrée)
│── resources/             # Fichiers XML pour Spring
│── README.md              # Documentation
│── pom.xml                # Fichier de configuration Maven
```
### 1️⃣ Création de l'interface IDao
https://github.com/hajargithub/TP-IOC/blob/master/src/main/java/ma/enset/dao/IDao.java


### 2️⃣ Implémentation de l'interface IDao
https://github.com/hajargithub/TP-IOC/blob/master/src/main/java/ma/enset/dao/DaoImp.java

### 3️⃣ Création de l'interface IMetier
https://github.com/hajargithub/TP-IOC/blob/master/src/main/java/ma/enset/metier/IMetier.java


### 4️⃣ Implémentation de IMetier avec un couplage faible
https://github.com/hajargithub/TP-IOC/blob/master/src/main/java/ma/enset/metier/IMetierImpl.java

### 5️⃣ Injection des dépendances

## ✅ a) Instanciation statique

  <img src="captures/Pres1.PNG" alt="Instanciation statique">


## ✅ b) Instanciation dynamique 

<img src="captures/Pres2.PNG" alt="Instanciation dynamique">

## ✅ c) Injection avec Spring
## 🔹 Version XML
<img src="captures/PresSpringXML.PNG" alt="Injection avec Spring XML">

## 🔹 Version avec annotations
<img src="captures/PresSpringAnnotation.PNG" alt="Injection avec Spring Annotations">


### 📝Conclusion

Ce projet met en pratique l’inversion de contrôle et l’injection de dépendances en Java en explorant différentes approches :✔ Instanciation statique (couplage fort)✔ Instanciation dynamique (réflexion Java)✔ Utilisation de Spring (XML et annotations)

Ces concepts sont essentiels pour réduire le couplage entre les classes, améliorer la maintenabilité et favoriser la réutilisabilité du code. 🚀

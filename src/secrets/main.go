package main

import (
	"flag"
	"io/ioutil"
	"log"
	"os"
)

var (
	config   string
	password string
	username string
)

func main() {
	flag.StringVar(&config, "config", "/etc/secrets/config.json", "The configuration file.")
	flag.StringVar(&password, "password", "", "The password.")
	flag.StringVar(&username, "username", "", "The username.")
	flag.Parse()

	log.SetFlags(0)

	if os.Getenv("TIK_PASSWORD") != "" {
		password = os.Getenv("TIK_PASSWORD")
	}

	if os.Getenv("TIK_USERNAME") != "" {
		username = os.Getenv("TIK_USERNAME")
	}

	data, err := ioutil.ReadFile(config)
	if err != nil {
		//log.Fatal(err)
		log.Print("could not find config file")
	}

	log.Printf("Username: %s", username)
	log.Printf("Password: %s", password)
	log.Println("Config:")
	log.Println(string(data))
}

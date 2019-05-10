package grails.lazy

import java.time.LocalDate

class BootStrap {

    def init = { servletContext ->
        Airport dfw = new Airport(name: "DFW").save()
        Location ny = new Location(city: "ny").save()
        Location la = new Location(city: "la").save()
        Location bos = new Location(city: "bos").save()
        new Flight(number: "1300", airport: dfw, destination: ny).save()
        new Flight(number: "1400", airport: dfw, destination: la).save()
        new Flight(number: "1500", airport: dfw, destination: bos).save()
    }
    def destroy = {
    }
}

package grails.lazy

import grails.gorm.transactions.Transactional

@Transactional
class AirportController {

    def index() {
        println "*** GET Airport"
        def airport = Airport.findByName("DFW")
        println "*** GET FLIGHTS"
        for (flight in airport.flights) {
            println "*** GET LOCATION"
            println flight.destination.city
        }
        render "OK"
    }
}

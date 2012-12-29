// Class to represent a row in the seat reservations grid
function SeatReservation(name, initialMeal) {
    var self = this;
    self.name = name;
    self.meal = ko.observable(initialMeal);

    self.formattedPrice = ko.computed(function() {
        var price = self.meal().price;
        return price ? "$" + price.toFixed(2) : "None";        
    });    
}


function MatchSetup() {
	var self = this;
	self.homeTeam = ko.observable("");
	self.awayTeam = ko.observable("");
	self.homePlayer = ko.observable("");
	self.awayPlayer = ko.observable("");

    self.isComplete = function() {
       return (self.homeTeam() && self.awayTeam() && self.homePlayer() && self.awayPlayer())

    }

}


function Match() {
	var self = this;
	self.setup = ko.observable();
	self.homeGoals = ko.observable();
	self.awayGoals = ko.observable();
	self.result = ko.computed(function() {
		return self.homeGoals() + " - " + self.awayGoals();
	});
}

function MatchesWrapper() {
	var self = this;
	self.homeTeam = ko.observableArray([]);

}
function MatchSetup() {
    var self = this;
    self.homeTeam = ko.observable("");
    self.awayTeam = ko.observable("");
    self.homePlayer = ko.observable("");
    self.awayPlayer = ko.observable("");

    self.isComplete = function () {
        return (self.homeTeam() && self.awayTeam() && self.homePlayer() && self.awayPlayer())

    }

}


function Match() {
    var self = this;
    self.id = null;
    self.setup = ko.observable();
    self.homeGoals = ko.observable();
    self.awayGoals = ko.observable();
    self.result = ko.computed(function () {
        return self.homeGoals() + " - " + self.awayGoals();
    });
}
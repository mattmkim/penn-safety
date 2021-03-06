var mongoose = require('mongoose');
var Schema = mongoose.Schema;
// the Alert model represents an accepted request: aka a publishable crime report
var alertSchema = new Schema({
    title: String, 
    email: String,
    description: String, 
    location: String,
    firstname: String,
    lastname: String,
    latitude: Number,
    longitude: Number
})

module.exports = mongoose.model('alert', alertSchema);
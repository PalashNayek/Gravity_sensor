package com.palash.gravity_sensor.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.palash.gravity_sensor.repository.SensorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SensorViewModel @Inject constructor(private val sensorRepository: SensorRepository) : ViewModel() {

    val gravityData: LiveData<Triple<Float, Float, Float>> = sensorRepository.gravityData

    fun startListening() {
        sensorRepository.startListening()
    }

    fun stopListening() {
        sensorRepository.stopListening()
    }
}
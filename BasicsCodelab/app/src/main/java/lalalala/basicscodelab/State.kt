package lalalala.basicscodelab

data class CalculatorState(
    val displayText: String = "0",
    val previousValue: Double? = null,
    val currentOperator: String? = null,
    val resetDisplayOnNextInput: Boolean = false,
    val inverseTrig: Boolean = false,
    val isFunctionExpanded: Boolean = false
)

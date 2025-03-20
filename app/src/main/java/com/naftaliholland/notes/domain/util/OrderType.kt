package com.naftaliholland.notes.domain.util

import androidx.room.Index

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
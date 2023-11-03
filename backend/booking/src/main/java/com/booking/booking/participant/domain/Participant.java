package com.booking.booking.participant.domain;

import com.booking.booking.meeting.domain.Meeting;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "participants")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long participantId;

    private Integer memberId;

    @ManyToOne
    @JoinColumn(name = "meetingId")
    private Meeting meeting;

    private Boolean attendanceStatus;

    private Boolean paymentStatus;
}
